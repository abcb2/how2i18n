# Javaでのi18n
http://docs.oracle.com/javase/tutorial/i18n/TOC.html

TOCは上記ページを訳出

## TOC
* 導入
  * 手っ取り早い例
    * Before i18n
    * After i18n
    * サンプルプログラム
    * サンプルプログラムのi18n(国際化)
  * チェックリスト
* ロケールの設定
  * ロケールの生成
  * IETF言語タグ(BCP47)
  * 使用可能なロケールの識別
  * 言語タグのフィルタリングとマッチング(lookup)
  * ロケールのスコープ
  * ロケール認識サービスのSPI(Service Provider Interface)
* ロケール特有のデータの分割
  * ResourceBundleクラス
  * ResourceBundleクラス利用の準備
  * PropertiesファイルとResourceBundleの組み合わせ
  * ListResourceBundleの使い方
  * ResourceBundleのロード方法のカスタマイズ
* フォーマット
  * 数字と通貨
    * 定義済みのフォーマットの利用
    * フォーマットのカスタマイズ
  * 日付と時刻
    * 定義済みのフォーマットの利用
    * フォーマットのカスタマイズ
    * 日付に関する略語の変更
  * Messages
    * 複合メッセージの取り扱い
    * 複数形の処理
* テキストの操作
  * 文字プロパティのチェック
  * 文字列の比較
    * ロケールに依存しない比較
    * 照合ルールのカスタマイズ
    * 照合処理のパフォーマンス改善
  * Unicode
    * Unicodeの専門用語
    * サロゲート補助文字
    * 文字と文字列のAPI
    * 使い方のサンプル
    * シームレスな多言語化における考慮点
    * 補助文字に関する情報
  * テキスト境界の検出
    * BreakIteratorクラスについて
    * 文字境界
    * 単語境界
    * センテンス境界
    * 行境界
  * LATIN数字の他ユニコード数字への変換
  * 非ユニコードテキストの変換
    * Byteエンコーディングと文字列
    * 文字とバイトストリーム
  * テキストの正規化
  * JTextComponentクラスによる双方向テキスト(右→左、左→右)の処理
* ネットワーク資源(ドメイン名等)の国際化
* 国際化を担うJavaモジュール
  * 独自Custom Resource Bundleのインストール